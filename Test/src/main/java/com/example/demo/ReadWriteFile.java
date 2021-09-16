package com.example.demo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ReadWriteFile {

	public static void main(String[] args) throws IOException, JSONException {

		File file = new File("D:\\RK\\Test\\src\\jsonFiles\\InputJson.json");
		String s = FileUtils.readFileToString(file, "utf-8");
		System.out.println(s);
		JSONObject inputJsonObj = new JSONObject(s);

		JSONArray data = (JSONArray) inputJsonObj.get("data");
		JSONObject data1 = (JSONObject) data.get(0);
		JSONObject taskSpecs = (JSONObject) data1.get("taskSpecs");
		JSONArray componentScoping = (JSONArray) taskSpecs.get("ComponentScoping");
		JSONObject obj = (JSONObject) componentScoping.get(0);
		JSONArray component = (JSONArray) obj.get("Components");

		JSONObject obj4 = new JSONObject();
		obj4.put("suspectResult", "");
		obj4.put("cbvutvi4vResult", " ");
		obj4.put("wellknownResult", "");
		obj4.put("uniqueResult", "");
		for (int i = 0; i < component.length(); i++) {
			JSONObject obj2 = (JSONObject) component.get(i);
			JSONArray records = obj2.getJSONArray("Records");
			if (records.length() != 0) {
				JSONObject obj3 = records.getJSONObject(0);
				JSONObject ruleResult = (JSONObject) (obj3.get("ruleResult"));
				JSONArray result = ruleResult.getJSONArray("result");
				if (result.get(0).equals("Include")) {
					obj3.put("multiEngineResults", obj4);
				}
			}
		}

		JSONObject newJsonObject = new JSONObject();
		newJsonObject.put("metadata", inputJsonObj.get("metadata"));
		data1.put("result", taskSpecs);
		data1.remove("taskSpecs");
		JSONObject newJsonObject1 = new JSONObject();
		newJsonObject1.put("", data1);
		newJsonObject.put("data", newJsonObject1);

		BufferedWriter f = new BufferedWriter(new FileWriter("D:\\RK\\Test\\src\\jsonFiles\\OutputJson.json"));
		f.write(newJsonObject.toString());
		f.close();

	}

}

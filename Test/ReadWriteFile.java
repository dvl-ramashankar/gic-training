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
		JSONObject obj2 = (JSONObject) component.get(0);
		JSONArray records = obj2.getJSONArray("Records");
		JSONObject obj3 = records.getJSONObject(0);
		JSONObject ruleResult = (JSONObject) (obj3.get("ruleResult"));
		JSONArray result = ruleResult.getJSONArray("result");
		if (result.get(0).equals("Include")) {
			JSONObject obj4 = new JSONObject();
			obj4.put("suspectResult", "");
			obj4.put("cbvutvi4vResult", " ");
			obj4.put("wellknownResult", "");
			obj4.put("uniqueResult", "");
			obj3.put("multiEngineResults", obj4);
			// System.out.println(obj3);
			String d = taskSpecs.toString();
			d = d.replace("taskSpecs", "result");
			JSONObject d2 = new JSONObject(d);

			JSONObject newJsonObject = new JSONObject();
			newJsonObject.put("metadata", inputJsonObj.get("metadata"));
			data1.put("result", d2);
			data1.remove("taskSpecs");
			newJsonObject.put("data", data1);

			BufferedWriter f = new BufferedWriter(new FileWriter("D:\\RK\\Test\\src\\jsonFiles\\OutputJson.json"));

			f.write(newJsonObject.toString());
			f.close();
		}
	}

}

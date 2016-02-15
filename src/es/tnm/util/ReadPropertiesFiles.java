package es.tnm.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;

public class ReadPropertiesFiles {

	public static HashMap loadProperties(File file) {
		Properties properties = new Properties();
		HashMap result = new HashMap<String, String>();
		try {
			FileInputStream propertiesStream = new FileInputStream(file);
			properties.load(propertiesStream);

			for (String key : properties.stringPropertyNames()) {
				String value = properties.getProperty(key);

				System.out.println(key + " => " + value);

				result.put(key, value);

			}
			propertiesStream.close();
			return result;

		} catch (IOException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		return null;
	}

}

package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Config {



        //QA environment; Developers environmet
//utility is normally static
        private static Properties p = new Properties();  //private so no one can access it
        static{
            String path="configuration.properties"; //or right click on configuration.properties and copy relative path
            try{
                FileInputStream file= new FileInputStream(path); //IO exception-->checked, have to have valid path, but if not valid will throw an exception
                p.load(file); //since this is throwing an exception we have to use try catch
                file.close();
            }
            catch (IOException e){
                System.out.println("Properties file not found");
            }
        }
        public static String getProperty(String keyword){
            return p.getProperty(keyword); //now we can call this method from anywhere and use it as set up
        }

    }



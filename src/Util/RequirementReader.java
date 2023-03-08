package Util;
import Basic.Requirement;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class RequirementReader {

  public static Requirement loadRequirement() throws IOException {
    //设置数组存放需求数值
    ArrayList<Integer> list = new ArrayList<>();
    String path = Controller.requirementFilePath;
    //读取需求
    InputStreamReader reader = null;
    BufferedReader br = null;
    try {
      File file = new File(path);
      reader = new InputStreamReader(new FileInputStream(file));
      br = new BufferedReader(reader);
      String data = "";
      while ((data = br.readLine()) != null) {
        String[] split = data.trim().split(": ");
        list.add(Integer.valueOf(split[1]));
      }
    } catch (IOException e) {
      throw new RuntimeException(e);
    } catch (NumberFormatException e) {
      throw new RuntimeException(e);
    } finally {
    }
    reader.close();
    br.close();
    return new Requirement(list.get(0), list.get(1), list.get(2), list.get(3), list.get(4));
  }

}

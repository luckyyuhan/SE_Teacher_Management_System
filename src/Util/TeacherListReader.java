package Util;
import Basic.TeacherCandidate;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class TeacherListReader {

  public static ArrayList<TeacherCandidate> loadTeacherList() throws IOException {
    ArrayList<TeacherCandidate> teacherCandidateList = new ArrayList<>();
    InputStreamReader reader = null;
    BufferedReader br = null;
    try {
      String path = Controller.teacherFilePath;
      File file = new File(path);
      reader = new InputStreamReader(new FileInputStream(file));
      br = new BufferedReader(reader);
      String line = " ";
      int i = 0;
      while ((line = br.readLine()) != null) {
        if (i!=0 && !line.isEmpty()){
          //去掉字符串前部和中间的多余空格并以一个空格隔开
          String[] split = line.trim().split("\\s+");
          TeacherCandidate teacherCandidate = new TeacherCandidate(
                  Integer.parseInt(split[0]),
                  split[1],
                  Integer.parseInt(split[2]),
                  Integer.parseInt(split[3]),
                  Integer.parseInt(split[4]),
                  Integer.parseInt(split[5]),
                  Integer.parseInt(split[6]));
          teacherCandidateList.add(teacherCandidate);

        }
        i++;
      }
    } catch (IOException e) {
      throw new RuntimeException(e);
    } catch (NumberFormatException e) {
      throw new RuntimeException(e);
    } finally {
    }
    reader.close();
    br.close();

    return teacherCandidateList;
  }

}

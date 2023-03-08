
package Util;
import Basic.TeacherCandidate;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class TeacherListWriter {

  public static void writeTeacherList(ArrayList<TeacherCandidate> teacherCandidateList) throws IOException {
    String path = Controller.teacherFilePath;
    FileWriter fw = null;
    try {
      File file = new File(path);
      fw = new FileWriter(file,false);
      String output = toString(teacherCandidateList);
      fw.write(output);
    } catch (IOException e) {
      throw new RuntimeException(e);
    } finally {
    }
    fw.close();
  }

  private static String toString(ArrayList<TeacherCandidate> teacherCandidateList) {
    String out = Controller.title + "\n";
    for (TeacherCandidate teacherCandidate : teacherCandidateList) {
      out += teacherCandidate.toString() + "\n";
    }
    return out;
  }

}

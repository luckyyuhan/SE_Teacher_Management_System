
package Util;

import Basic.Requirement;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class RequirementWriter {

  public static void writeRequirement(Requirement requirement) throws IOException {
    FileWriter fw = null;
    try {
      String requirementPath = Controller.requirementFilePath;
      String output =
          "workingExperience: " + requirement.getWorkingExperience() +
                  "\nprofessionalAbility: " + requirement.getProfessionalAbility() +
                  "\ncommunicationAbility: " + requirement.getCommunicationAbility() +
                  "\nstrainAbility: " + requirement.getStrainAbility() +
                  "\nstudentSatisfaction: " + requirement.getStudentSatisfaction();

      File file = new File(requirementPath);
      fw = new FileWriter(file,false);
      fw.write(output);
    } catch (IOException e) {
      throw new RuntimeException(e);
    } finally {
    }
    fw.close();
  }


}

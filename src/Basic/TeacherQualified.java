
package Basic;
public class TeacherQualified {

  int teacherId;
  String name;
  private int workingExperience;
  private int professionalAbility;
  private int communicationAbility;
  private int strainAbility;
  private int studentSatisfaction;

  public TeacherQualified() {
  }

  public int getTeacherId() {
    return teacherId;
  }

  public void setTeacherId(int teacherId) {
    this.teacherId = teacherId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getWorkingExperience() {
    return workingExperience;
  }

  public void setWorkingExperience(int workingExperience) {
    this.workingExperience = workingExperience;
  }

  public int getProfessionalAbility() {
    return professionalAbility;
  }

  public void setProfessionalAbility(int teachingAbilityScore) {
    this.professionalAbility = professionalAbility;
  }

  public int getCommunicationAbility() {
    return communicationAbility;
  }

  public void setCommunicationAbility(int communicationAbility) {
    this.communicationAbility = communicationAbility;
  }

  public int getStrainAbility() {
    return strainAbility;
  }

  public void setStrainAbility(int strainAbility) {
    this.strainAbility = strainAbility;
  }

  public int getStudentSatisfaction() {
    return studentSatisfaction;
  }

  public void setStudentSatisfaction(int studentSatisfaction) {
    this.studentSatisfaction = studentSatisfaction;
  }
}
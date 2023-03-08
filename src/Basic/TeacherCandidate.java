package Basic;



public class TeacherCandidate {

  private int id;
  private String name;
  private int workingExperience;
  private int professionalAbility;
  private int communicationAbility;
  private int strainAbility;
  private int studentSatisfaction;

  public TeacherCandidate() {
  }

  public TeacherCandidate(int id, String name, int workingExperience, int professionalAbility,
                          int communicationAbility, int strainAbility, int studentSatisfaction) {
    this.id = id;
    this.name = name;
    this.workingExperience = workingExperience;
    this.professionalAbility = professionalAbility;
    this.communicationAbility = communicationAbility;
    this.strainAbility = strainAbility;
    this.studentSatisfaction = studentSatisfaction;
  }

  public TeacherCandidate(TeacherQualified teacherQualified) {
    this.name = teacherQualified.getName();
    this.workingExperience= teacherQualified.getWorkingExperience();
    this.professionalAbility = teacherQualified.getProfessionalAbility();
    this.communicationAbility = teacherQualified.getCommunicationAbility();
    this.strainAbility = teacherQualified.getStrainAbility();
    this.studentSatisfaction = teacherQualified.getStudentSatisfaction();
  }


  @Override
  public String toString() {

    return String.format("%-6s", id) + String.format("%-25s", name) + String.format("%-12s",
            workingExperience) + String.format("%-18s", professionalAbility) + String.format("%-18s",
            communicationAbility) + String.format("%-18s", strainAbility) + String.format("%-18s", studentSatisfaction);
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

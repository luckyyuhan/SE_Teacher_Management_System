package Basic;

public class Requirement {
  private int workingExperience;
  private int professionalAbility;
  private int communicationAbility;
  private int strainAbility;
  private int studentSatisfaction;

  public Requirement() {
  }

  public Requirement(int workingExperience, int professionalAbility, int communicationAbility,
      int strainAbility, int studentSatisfaction) {
    this.workingExperience = workingExperience;
    this.professionalAbility = professionalAbility;
    this.communicationAbility = communicationAbility;
    this.strainAbility = strainAbility;
    this.studentSatisfaction = studentSatisfaction;
  }

  @Override
  public String toString() {
    return
        "minimum working experience: " + workingExperience +
        "\nminimum teaching ability score: " + professionalAbility +
        "\nminimum class atmosphere score: " + communicationAbility +
        "\nminimum communication score: " +  strainAbility+
        "\nminimum student satisfaction: " + studentSatisfaction;
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

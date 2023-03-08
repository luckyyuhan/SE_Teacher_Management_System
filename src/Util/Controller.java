package Util;

import Basic.Administrator;
import Basic.ClassDirector;
import Basic.Requirement;
import Basic.TeacherCandidate;

import java.io.IOException;
import java.util.ArrayList;

public class Controller {
  ClassDirector classDirector;
  Administrator administrator;
  ArrayList<TeacherCandidate> teacherCandidateList;
  Requirement requirement;
  public static String requirementFilePath;
  public static String teacherFilePath;
  public static String title;

  public Controller() throws IOException {
    classDirector = new ClassDirector();
    administrator = new Administrator();
    // path to requirement file
    requirementFilePath = "src/conf/requirement.txt";
    // path to database file
    teacherFilePath = "src/conf/teacherCandidate.txt";
    // load requirement
    requirement = RequirementReader.loadRequirement();
    // load teachers
    teacherCandidateList = TeacherListReader.loadTeacherList();
    title = "id name  workExperiment teachingAbility classAtmosphere communication studentSatisfaction";
  }

  public ClassDirector getCourseDirector() {
    return classDirector;
  }


  public Administrator getAdministrator() {
    return administrator;
  }

  public ArrayList<TeacherCandidate> getTeacherList() {
    return teacherCandidateList;
  }

  public void setTeacherList(ArrayList<TeacherCandidate> teacherCandidateList) {
    this.teacherCandidateList = teacherCandidateList;
  }

  public Requirement getRequirement() {
    return requirement;
  }

  public void setRequirement(Requirement requirement) {
    this.requirement = requirement;
  }
}

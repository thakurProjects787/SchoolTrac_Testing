package com.projects.thakur.apnaschool.Model;



public class DailyStudentAttendance {

    private String calculated_attnd = "";
    private String all_classes_attnd = "";
    private String all_teachers_sttnd = "";
    private String any_open_points = "";

    public DailyStudentAttendance() {
    }

    public String getCalculated_attnd() {
        return calculated_attnd;
    }

    public void setCalculated_attnd(String calculated_attnd) {
        this.calculated_attnd = calculated_attnd;
    }

    public String getAll_classes_attnd() {
        return all_classes_attnd;
    }

    public void setAll_classes_attnd(String all_classes_attnd) {
        this.all_classes_attnd = all_classes_attnd;
    }

    public String getAll_teachers_sttnd() {
        return all_teachers_sttnd;
    }

    public void setAll_teachers_sttnd(String all_teachers_sttnd) {
        this.all_teachers_sttnd = all_teachers_sttnd;
    }

    public String getAny_open_points() {
        return any_open_points;
    }

    public void setAny_open_points(String any_open_points) {
        this.any_open_points = any_open_points;
    }


}

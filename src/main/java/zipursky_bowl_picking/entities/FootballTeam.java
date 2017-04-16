package zipursky_bowl_picking.entities;

import zipursky_bowl_picking.utils.Record;

/**
 * Created by Aaron Zipursky on 12/12/16.
 */
public class FootballTeam {

    private Integer id;
    private String schoolName;
    private String schoolNickname;
    private Record schoolRecord;
    private String conference;

    public FootballTeam() {}

    public FootballTeam(String schoolName) {
        this.schoolName = schoolName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSchoolNickname() {
        return schoolNickname;
    }

    public void setSchoolNickname(String schoolNickname) {
        this.schoolNickname = schoolNickname;
    }

    public Record getSchoolRecord() {
        return schoolRecord;
    }

    public void setSchoolRecord(Record schoolRecord) {
        this.schoolRecord = schoolRecord;
    }

    public String getConference() {
        return conference;
    }

    public void setConference(String conference) {
        this.conference = conference;
    }

}

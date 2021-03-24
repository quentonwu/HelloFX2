package org.openjfx;

import java.util.HashMap;
import java.util.Map;

public class UserSimple
{
    private String name;
    private String email;
    private Integer age;
    private Boolean isDeveloper;


    public UserSimple(String newName, String newEmail, Integer newAge, Boolean newisDeveloper)
    {
        this.name = newName;
        this.email = newEmail;
        this.age = newAge;
        this.isDeveloper = newisDeveloper;
    }

    public HashMap getMap()
    {
        Map entries = new HashMap();
        entries.put("Name", this.name);
        entries.put("Email", this.email);
        entries.put("Age", this.age);
        entries.put("IsDeveloper", this.isDeveloper);
        return  (HashMap)entries;
    }


    public String getName()
    {
        String gname = this.name;
        return gname;
    }

    public String getEmail()
    {
        String gemail = this.email;
        return gemail;
    }

    public int getAge()
    {
        int gage = this.age;
        return gage;
    }

    public Boolean getIsDeveloper()
    {
        Boolean gisDeveloper = this.isDeveloper;
        return gisDeveloper;
    }

}
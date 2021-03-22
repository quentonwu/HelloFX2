package org.openjfx;

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

    public String getName()
    {
        String name = this.name;
        return name;
    }

    public String getEmail()
    {
        String email = this.email;
        return email;
    }

    public Integer getAge()
    {
        Integer age = this.age;
        return age;
    }

    public Boolean getIsDeveloper()
    {
        Boolean isDeveloper = this.isDeveloper;
        return isDeveloper;
    }

}
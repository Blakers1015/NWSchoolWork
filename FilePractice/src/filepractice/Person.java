/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filepractice;

/**
 *
 * @author s523353
 */
public class Person {
    private String fname;
    private String lname;
    private int id;
public Person(String fname, String lname, int id)
{
    this.fname = fname;
    this.lname = lname;
    this.id = id;
}

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public int getId() {
        return id;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setId(int id) {
        this.id = id;
    }
    @Override
    public String toString()
    {
     return "First name: " +  fname + " Last name: " + lname + " ID: " + id;   
    }
}

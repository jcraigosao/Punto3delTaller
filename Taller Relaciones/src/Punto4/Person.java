/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto4;

/**
 *
 * @author TOSHIBA
 */
public class Person {
private Date date;

    public Person(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Person{" + "date=" + date + '}';
    }

}
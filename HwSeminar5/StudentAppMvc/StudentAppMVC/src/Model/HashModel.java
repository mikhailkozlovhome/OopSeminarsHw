package Model;

import java.util.HashMap;
import java.util.List;

import Controller.iGetModel;

public class HashModel implements iGetModel{
    private HashMap<Integer, String> students = new HashMap<Integer, String>();


    public HashModel(HashMap<Integer, String> students) {
        this.students = students;
    }

    @Override
    public List<Student> getAllStudents() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllStudents'");
    }

    
}

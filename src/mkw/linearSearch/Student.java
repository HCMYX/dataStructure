package mkw.linearSearch;

import org.apache.tools.ant.util.StringUtils;

public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student){
            Student another = (Student)obj;
            return this.name.equals(another.getName());
        }else {
            return false;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

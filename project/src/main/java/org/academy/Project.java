package org.academy;

public class Project {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {

        System.out.println(new Direct().toString());
        System.out.println(new Transitive().toString());

        Class<?> direct = ClassLoader.getSystemClassLoader().loadClass("org.academy.Direct");
        System.out.println(direct.newInstance().toString());

        Class<AcademyInterface> transitive = (Class<AcademyInterface>) ClassLoader.getSystemClassLoader().loadClass("org.academy.Transitive");
        System.out.println(transitive.newInstance().academyMethod());
    }
}

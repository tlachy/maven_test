package org.academy;

import static java.lang.ClassLoader.getSystemClassLoader;

public class Test {

    @org.junit.Test
    public void testDependency() throws Exception {

        System.out.println(new Direct().toString());
        System.out.println(new Transitive().toString());

        Class<?> direct = getSystemClassLoader().loadClass("org.academy.Direct");
        System.out.println(direct.newInstance().toString());

        Class<AcademyInterface> transitive = (Class<AcademyInterface>) getSystemClassLoader().loadClass("org.academy.Transitive");
        System.out.println(transitive.newInstance().academyMethod());
    }
}

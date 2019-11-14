module web {
    requires spring.boot.autoconfigure;
    requires spring.data.jpa;
    requires spring.context;
    requires spring.boot;
    requires spring.web;
    requires persistence;
    requires domain;

    requires java.sql;

    requires net.bytebuddy;
    requires com.fasterxml.classmate;
    requires spring.webmvc;

    opens dev.ned.web to spring.core, spring.beans, spring.context, spring.web;
    //export dev.ned.web to module spring.beans
}
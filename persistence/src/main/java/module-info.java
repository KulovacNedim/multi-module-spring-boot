module persistence {
    exports dev.ned.persistence;
    requires spring.context;
    requires spring.data.jpa;
    requires domain;
    requires spring.boot;
}
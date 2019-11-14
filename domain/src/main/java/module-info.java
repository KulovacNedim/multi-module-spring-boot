module domain {
    exports dev.ned.domain;
    requires java.persistence;
    opens dev.ned.domain to org.hibernate.orm.core, spring.core;
}
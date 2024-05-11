FROM openjdk:17.0
COPY target/gfg_calc1.jar gfg_calc1.jar
cmd java -jar gfg_calc1.jar
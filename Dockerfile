FROM openjdk:17
COPY target/gfg_calc1.jar gfg_calc1.jar
CMD java -jar gfg_calc1.jar
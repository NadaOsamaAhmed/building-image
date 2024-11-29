FROM openjdk

WORKDIR /nadosh

COPY Test.java .

RUN javac Test.java

CMD java Test
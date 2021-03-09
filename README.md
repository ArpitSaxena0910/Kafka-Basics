***Kafka Basics with Springboot***

It's a small project to publish/consume data to/from kafka topics running on local server using springboot.

Commands to host/create kakfa topics on localhost

1. *Start Zookeeper* - bin\windows\zookeeper-server-start.bat config\zookeeper.properties
    
2. *Start Kafka* - bin\windows\kafka-server-start.bat config\server.properties

3. *Shutdown Kafka* - bin\windows\kafka-server-stop.bat

4. *Shutdown Zookeeper* - bin\windows\zookeeper-server-stop.bat

5. *Create a new Topic* - bin\windows\kafka-topics.bat --create --bootstrap-server localhost:9092 --replication-factor 1 --partitions 1 --topic test

6. *List all topics* - bin\windows\kafka-topics.bat --list --bootstrap-server localhost:9092

7. *Produce Messages* - bin\windows\kafka-console-producer.bat --bootstrap-server localhost:9092 --topic test

8. *Consume Messages* - bin\windows\kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic test --from-beginning

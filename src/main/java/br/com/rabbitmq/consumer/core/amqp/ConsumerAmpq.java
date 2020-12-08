package br.com.rabbitmq.consumer.core.amqp;

public interface ConsumerAmpq<T> {

	void consumer(T t);
}

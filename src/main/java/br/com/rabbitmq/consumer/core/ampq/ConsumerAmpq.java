package br.com.rabbitmq.consumer.core.ampq;

public interface ConsumerAmpq<T> {

	void consumer(T t);
}

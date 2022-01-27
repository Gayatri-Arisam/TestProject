package com.example.consumerRabbitmq.consumerRabbitmq.controller;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.example.consumerRabbitmq.consumerRabbitmq.model.Message;

import lombok.extern.slf4j.Slf4j;


@Component
@Slf4j
public class Consumer {

	@RabbitListener(queues = "queue.AA")
	private void receiveA(String message)
	{
		System.out.println("Message received from Queue A"+message);
	}
	@RabbitListener(queues = "queue.BB")
	private void receiveB(String message)
	{
		System.out.println("Message received from Queue B"+message);
	}
	@RabbitListener(queues = "queue.all")
	private void receiveAll(String message)
	{
		System.out.println("Message received from Queue All"+message);
	}
}

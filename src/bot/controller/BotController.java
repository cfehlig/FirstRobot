package bot.controller;

import lejos.hardware.lcd.LCD;
import lejos.utility.Delay;

import bot.model.EV3Bot;

public class BotController
{
	
	private String message;
	private int xPosition, yPosition;
	private long waitTime;
	
	public BotController()
	{
		this.xPosition = 50;
		this.yPosition = 100;
		this.waitTime = 4000;
		this.message = "Something about a robot";
		
		sillyBot = new EV3Bot();
	}
	
	/**
	 * @return the message
	 */
	public String getMessage()
	{
		return message;
	}

	/**
	 * @return the xPosition
	 */
	public int getxPosition()
	{
		return xPosition;
	}

	/**
	 * @return the yPosition
	 */
	public int getyPosition()
	{
		return yPosition;
	}

	/**
	 * @return the waitTime
	 */
	public long getWaitTime()
	{
		return waitTime;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message)
	{
		this.message = message;
	}

	/**
	 * @param xPosition the xPosition to set
	 */
	public void setxPosition(int xPosition)
	{
		this.xPosition = xPosition;
	}

	/**
	 * @param yPosition the yPosition to set
	 */
	public void setyPosition(int yPosition)
	{
		this.yPosition = yPosition;
	}

	/**
	 * @param waitTime the waitTime to set
	 */
	public void setWaitTime(long waitTime)
	{
		this.waitTime = waitTime;
	}

	public void start()
	{
		LCD.drawString(message, xPosition, yPosition);
		Delay.msDelay(waitTime);
		sillyBot.driveRoom();
	}

}

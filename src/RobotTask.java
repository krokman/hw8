public class RobotTask {
	public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {
		// your implementation here
		int trying = 0;
		for (int i = 0; i < 3; i++) {
			try (RobotConnection robotConnection = robotConnectionManager.getConnection()) {
				robotConnection.moveRobotTo(toX, toY);
				i = 3;
			} catch (RobotConnectionException e) {
				if (++trying != 3) {
					continue;
				}
				throw new RobotConnectionException("RobotConnection Doesnt Work, Check It");
			}
		}
	}
}

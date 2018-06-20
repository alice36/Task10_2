public enum Direction {
    NORTH("północ"),
    EAST("wschód"),
    SOUTH("południe"),
    WEST("zachód"),
    UNDEFINED("nieznany");

    private final String directionName;

    Direction(String directionName) {
        this.directionName = directionName;
    }

    public String getDirectionName() {
        return directionName;
    }

    public static Direction convert (int num){
        Direction[] directions = Direction.values();
        Direction finalDirection = null;
        boolean check = false;

        for (Direction direction : directions) {
            if (direction.ordinal() == num) {
                finalDirection = direction;
                check = true;
            }
        }
        if (!check) finalDirection = directions[4];
        return finalDirection;
    }
}
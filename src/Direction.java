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

}
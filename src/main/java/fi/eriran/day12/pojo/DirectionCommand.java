package fi.eriran.day12.pojo;

public class DirectionCommand {

    private final Command command;
    private final int amount;

    public DirectionCommand(Command command, int amount) {
        this.command = command;
        this.amount = amount;
    }

    public Command getCommand() {
        return command;
    }

    public int getAmount() {
        return amount;
    }
}

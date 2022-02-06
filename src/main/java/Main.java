import pl.kocan.builder.house.*;

public class Main {

    public static void main(String[] args) {

        House house = new House.HouseBuilder()
                .buildWalls("walls")
                .buildFloors("floors")
                .buildRoof("roof")
                .buildRooms("rooms")
                .build();
        System.out.println(house);

        SmallHouseBuilder smallHouseBuilder = new SmallHouseBuilder();
        BigHouseBuilder bigHouseBuilder = new BigHouseBuilder();

        HouseDirector smallHouseDirector = new HouseDirector(smallHouseBuilder);

        smallHouseDirector.buildHouse();

        HouseDirector bigHouseDirector = new HouseDirector(bigHouseBuilder);

        bigHouseDirector.buildHouse();

        House2 smallHouse = smallHouseBuilder.getHouse();
        House2 bigHouse = bigHouseDirector.getHouse();

        System.out.println(smallHouse);
        System.out.println(bigHouse);

    }

}

package pl.kocan.builder.house;

public interface HouseBuilder {

    void buildWalls();

    void buildFloors();

    void buildRooms();

    void buildRoof();

    void buildWindows();

    void buildDoors();

    void buildGarage();

    House2 getHouse();

}

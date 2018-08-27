package buildings

open class BaseBuildingMaterial {
    open val numberNeeded: Int = 1
}

class Wood : BaseBuildingMaterial() {
    override val numberNeeded: Int = 4
}

class Brick : BaseBuildingMaterial() {
    override val numberNeeded: Int = 8
}

class Building<T : BaseBuildingMaterial>(val buildingMaterial: T) {
    val baseMaterialsNeeded: Int = 100
    val actualMaterialsNeeded: Int = buildingMaterial.numberNeeded * baseMaterialsNeeded

    fun build() = println(buildingMaterial::class.simpleName + actualMaterialsNeeded)
}

fun main(args: Array<String>) {
    Building(Wood()).build()
}
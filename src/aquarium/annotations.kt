package aquarium

import com.sun.org.apache.xpath.internal.operations.Bool
import kotlin.reflect.KClass
import kotlin.reflect.full.findAnnotation

annotation class ImAPlant

@Target(AnnotationTarget.PROPERTY_GETTER)
annotation class OnGet

@Target(AnnotationTarget.PROPERTY_SETTER)
annotation class OnSet

@ImAPlant
class Plant {
    fun trim() {}
    fun fertilize() {}

    @get:OnGet
    val isGrowing: Boolean = true

    @set:OnSet
    var needsFood: Boolean = false
}

fun reflections() {
    val classObj: KClass<Plant> = Plant::class
    for (annotation in classObj.annotations) {
        println(annotation.annotationClass.simpleName)
    }
    val annotated: ImAPlant? = classObj.findAnnotation<ImAPlant>()
    annotated?.apply {
        println("Found a plant annotation!")
    }
}

fun main(args: Array<String>) {
    reflections()
}
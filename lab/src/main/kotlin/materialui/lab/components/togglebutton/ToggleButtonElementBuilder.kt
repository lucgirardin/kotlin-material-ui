package materialui.lab.components.togglebutton

import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.buttonbase.ButtonBaseElementBuilder
import materialui.components.getValue
import materialui.components.setValue
import materialui.lab.components.togglebutton.enums.ToggleButtonStyle
import react.RClass

class ToggleButtonElementBuilder<T: Tag> internal constructor(
    type: RClass<ToggleButtonProps>,
    classMap: List<Pair<Enum<*>, String>>,
    factory: (TagConsumer<Unit>) -> T
) : ButtonBaseElementBuilder<T, ToggleButtonProps>(type, classMap, factory) {
    fun Tag.classes(vararg classMap: Pair<ToggleButtonStyle, String>) {
        classes(classMap.map { it.first to it.second })
    }

    var Tag.disableFocusRipple: Boolean? by materialProps
    var selected: Boolean? by materialProps
    var value: Any? by materialProps
}

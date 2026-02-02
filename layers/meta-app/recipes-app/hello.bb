python do_print() {
    bb.plain("**************************")
    bb.plain("Recipe name: %s" % d.getVar('PN'))
    bb.plain("**************************")
}

DEPENDS += "bsp devtools"
do_print[deptask] = "do_print"

addtask print before do_build

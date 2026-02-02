python do_print() {
    bb.plain("**************************")
    bb.plain("Recipe name: %s" % d.getVar('PN'))
    bb.plain("**************************")
}

addtask print before do_build

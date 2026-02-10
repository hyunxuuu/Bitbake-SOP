python do_print() {
    bb.plain("**************************")
    bb.plain("%s - %s" % (d.getVar('PN'), d.getVar('BB_CURRENTTASK')))
    bb.plain("**************************")
}

DEPENDS += "core devtools"
do_print[deptask] = "do_build"
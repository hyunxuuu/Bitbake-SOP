python do_init() {
    bb.plain("**************************")
    bb.plain("%s - %s" % (d.getVar('PN'), d.getVar('BB_CURRENTTASK')))
    bb.plain("**************************")
}

python do_build() {
    bb.plain("**************************")
    bb.plain("%s - %s" % (d.getVar('PN'), d.getVar('BB_CURRENTTASK')))
    bb.plain("**************************")
}
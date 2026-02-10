do_print(){
	:
}

do_fetch(){
	:
}

do_unpack(){
	:
}

do_patch(){
	:
}

do_configure(){
	:
}

do_compile(){
	:
}

do_build(){
	:
}

addtask print
addtask fetch after do_print
addtask unpack after do_fetch
addtask patch after do_unpack
addtask configure after do_patch
addtask compile after do_configure
addtask build after do_compile
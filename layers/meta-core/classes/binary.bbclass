deltask print
deltask fetch
deltask unpack
deltask patch
deltask configure
deltask compile
deltask build

do_print(){
	:
}

do_fetch(){
	:
}

do_unpack(){
	:
}

do_build(){
	:
}

addtask print
addtask fetch after do_print
addtask unpack after do_fetch
addtask build after do_unpack
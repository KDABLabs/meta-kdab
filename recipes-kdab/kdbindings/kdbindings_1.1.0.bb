SUMMARY = "Reactive programming & data binding in C++"
HOMEPAGE = "https://github.com/KDAB/KDBindings"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSES/MIT.txt;md5=7dda4e90ded66ab88b86f76169f28663"

SRCREV = "efb54c58c3c2fce280d7089617935ec265fe4e2d"
SRC_URI = "git://github.com/KDAB/KDBindings;branch=main;protocol=https"

S = "${WORKDIR}/git"

inherit cmake

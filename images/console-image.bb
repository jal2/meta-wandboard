SUMMARY = "A console development image"

require images/basic-dev-image.bb

IMAGE_INSTALL += " \
    firewall \
    root-upgrader \
    u-boot-scr \
    ${SECURITY_TOOLS} \
    ${WIREGUARD} \
"

export IMAGE_BASENAME = "console-image"

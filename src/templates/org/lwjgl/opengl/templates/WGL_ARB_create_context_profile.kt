/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

fun WGL_ARB_create_context_profile() = "WGLARBCreateContextProfile".nativeClassWGL("WGL_ARB_create_context_profile", ARB) {
	nativeImport (
		"OpenGL.h"
	)

	documentation =
		"""
		Native bindings to the ${url("http://www.opengl.org/registry/specs/ARB/wgl_create_context.txt", templateName)} extension.

		Add an attribute to ##WGLARBCreateContext, specifying the GL profile requested for a context of OpenGL 3.2 or later.
		"""

	IntConstant.block(
		"Accepted as an attribute name in {@code attribList}.",

		"CONTEXT_PROFILE_MASK_ARB" _ 0x9126
	)

	IntConstant.block(
		"Accepted as bits in the attribute value for #CONTEXT_PROFILE_MASK_ARB in {@code attribList}.",

		"CONTEXT_CORE_PROFILE_BIT_ARB" _ 0x00000001,
		"CONTEXT_COMPATIBILITY_PROFILE_BIT_ARB" _ 0x00000002
	)

}
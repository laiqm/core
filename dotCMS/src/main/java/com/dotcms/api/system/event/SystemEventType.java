package com.dotcms.api.system.event;

/**
 * A System Event can be generated for a variety of reasons, such as:
 * <ul>
 * <li>A notification for the user <b>NOTIFICATION</b>.</li>
 * <li>A site change: <b>SAVE_SITE, UPDATE_SITE, ARCHIVE_SITE, UN_ARCHIVE_SITE, UPDATE_SITE_PERMISSIONS</b>.</li>
 * <li>A content type change: <b>SAVE_BASE_CONTENT_TYPE, UPDATE_BASE_CONTENT_TYPE, DELETE_BASE_CONTENT_TYPE</b>.</li>
 * <li>A folder change: <b>SAVE_FOLDER, UPDATE_FOLDER, DELETE_FOLDER</b>.</li>
 * <li>A page change: <b>SAVE_PAGE_ASSET, UPDATE_PAGE_ASSET, ARCHIVE_PAGE_ASSET, UN_ARCHIVE_PAGE_ASSET, DELETE_PAGE_ASSET, PUBLISH_PAGE_ASSET, UN_PUBLISH_PAGE_ASSET</b>.</li>
 * <li>A file change: <b>SAVE_FILE_ASSET, UPDATE_FILE_ASSET, ARCHIVE_FILE_ASSET, UN_ARCHIVE_FILE_ASSET, DELETE_FILE_ASSET, PUBLISH_FILE_ASSET, UN_PUBLISH_FILE_ASSET</b>.</li>
 * <li>A file change: <b>SAVE_LINK, UPDATE_LINK, ARCHIVE_LINK, UN_ARCHIVE_LINK, MOVE_LINK, COPY_LINK, DELETE_LINK, PUBLISH_LINK, UN_PUBLISH_LINK</b>.</li>
 * <li>A file change: <b>MOVE_FOLDER, COPY_FOLDER, MOVE_FILE_ASSET, COPY_FILE_ASSET, MOVE_PAGE_ASSET, COPY_PAGE_ASSET</b>.</li>
 * </ul>
 * <p>
 * The idea behind this class is to map a type of event with different possible
 * scenarios that developers or third-party systems would create System Events
 * for. This way, client-side code can handle specific types of system events
 * and make dotCMS react accordingly.
 * 
 * @author Jose Castro
 * @version 3.7
 * @since Jul 11, 2016
 *
 */
public enum SystemEventType {

	NOTIFICATION,

	SAVE_SITE,
	UPDATE_SITE,
	ARCHIVE_SITE,
	UN_ARCHIVE_SITE,
	UPDATE_SITE_PERMISSIONS,

	SAVE_BASE_CONTENT_TYPE,
	UPDATE_BASE_CONTENT_TYPE,
	DELETE_BASE_CONTENT_TYPE,

	SAVE_FOLDER,
	UPDATE_FOLDER,
	DELETE_FOLDER,

	SAVE_PAGE_ASSET,
	UPDATE_PAGE_ASSET,
	ARCHIVE_PAGE_ASSET,
	UN_ARCHIVE_PAGE_ASSET,
	DELETE_PAGE_ASSET,
	PUBLISH_PAGE_ASSET,
	UN_PUBLISH_PAGE_ASSET,

	SAVE_FILE_ASSET,
	UPDATE_FILE_ASSET,
	ARCHIVE_FILE_ASSET,
	UN_ARCHIVE_FILE_ASSET,
	DELETE_FILE_ASSET,
	PUBLISH_FILE_ASSET,
	UN_PUBLISH_FILE_ASSET,

	SAVE_LINK,
	UPDATE_LINK,
	ARCHIVE_LINK,
	UN_ARCHIVE_LINK,
	MOVE_LINK,
	COPY_LINK,
	DELETE_LINK,
	PUBLISH_LINK,
	UN_PUBLISH_LINK,

	MOVE_FOLDER,
	COPY_FOLDER,
	MOVE_FILE_ASSET,
	COPY_FILE_ASSET,
	MOVE_PAGE_ASSET,
	COPY_PAGE_ASSET,
	
	UPDATE_PORTLET_LAYOUTS,
}

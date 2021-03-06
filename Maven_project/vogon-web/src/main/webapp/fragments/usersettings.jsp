<%@ page session="false" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<fmt:setBundle basename="org.zlogic.vogon.web.webmessages" />
<form name="userSettingsForm" autocomplete="off" novalidate>
	<div class="panel panel-default">
		<div class="panel-body">
			<div class="form-group" ng-class="{ 'has-error': userSettingsForm.username.$invalid }">
				<label><fmt:message key="USERNAME"/></label>
				<input type="text" name="username" class="form-control" ng-model="user.username" placeholder="<fmt:message key="ENTER_USERNAME"/>" required />
			</div>
			<div class="form-group">
				<label><fmt:message key="PASSWORD"/></label>
				<input type="password" class="form-control" ng-model="user.password" placeholder="<fmt:message key="ENTER_NEW_PASSWORD"/>" />
			</div>
			<div class="form-group">
				<div class="form-inline">
					<button ng-click="importData()" ng-disabled="!file" class="btn btn-default" type="button"><span class="glyphicon glyphicon-import" aria-hidden="true"></span> <fmt:message key="IMPORT_DATA"/></button>
					<input type="file" onchange="angular.element(this).scope().setFile(this)" class="form-control-file" />
				</div>
			</div>
			<div class="form-group">
				<button ng-click="exportData()" class="btn btn-default" type="button"><span class="glyphicon glyphicon-export" aria-hidden="true"></span> <fmt:message key="EXPORT_DATA"/></button>
			</div>
			<p>
				<button ng-click="cancelEditing()" class="btn btn-default" type="button"><span class="glyphicon glyphicon-remove" aria-hidden="true"></span> <fmt:message key="CANCEL"/></button>
				<button ng-click="submitEditing()" class="btn btn-primary" ng-disabled="userSettingsForm.$invalid" type="submit"><span class="glyphicon glyphicon-ok" aria-hidden="true"></span> <fmt:message key="APPLY"/></button>
			</p>
		</div>
	</div>
</form>
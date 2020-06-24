<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/views/BT2/inc/header.jsp"%>
            <!-- Sub navigation -->
            <div id="subnav">
                <%@include file="/views/BT2/inc/menu.jsp"%>
                <div style="clear: both;"></div>
            </div> <!-- End #subnav -->
        </div> <!-- End #header -->
        
		<div class="container_12">
            <div class="bottom-spacing">
                  <!-- Button -->
                  <div class="float-left">
                      <a href="add.jsp" class="button">
                      	<span>Thêm sản phẩm mới <img src="images/plus-small.gif" alt="Thêm tin mới"></span>
                      </a>
                  </div>
                  <div class="clear"></div>
            </div>
            
            <div class="grid_12">
                <!-- Example table -->
                <div class="module">
                	<h2><span>Danh sách tin tức</span></h2>
                    
                    <div class="module-table-body">
                    	<form action="">
                        <table id="myTable" class="tablesorter">
                        	<thead>
                                <tr>
                                    <th style="width:4%; text-align: center;">ID</th>
                                    <th>Tên tin</th>
                                    <th style="width:20%">Loại hoa</th>
                                    <th style="width:16%; text-align: center;">Hình ảnh</th>
                                    <th style="width:11%; text-align: center;">Chức năng</th>
                                </tr>
                            </thead>
                            <tbody>
                                <tr>
                                    <td class="align-center">1</td>
                                    <td><a href="">Hoa Phong Lan</a></td>
                                    <td>Khai trương</td>
                                    <td align="center"><img src="images/tmp/hoa1.jpg" class="hoa" /></td>
                                    <td align="center">
                                        <a href="">Sửa <img src="images/pencil.gif" alt="edit" /></a>
                                        <a href="">Xóa <img src="images/bin.gif" width="16" height="16" alt="delete" /></a>
                                    </td>
                                </tr>
                                <tr>
                                    <td class="align-center">2</td>
                                    <td><a href="">Hoa Tỉ muội</a></td>
                                    <td>Khai trương</td>
                                    <td align="center"><img src="images/tmp/hoa2.jpg" class="hoa" /></td>
                                    <td align="center">
                                        <a href="">Sửa <img src="images/pencil.gif" alt="edit" /></a>
                                        <a href="">Xóa <img src="images/bin.gif" width="16" height="16" alt="delete" /></a>
                                    </td>
                                </tr>
                                <tr>
                                    <td class="align-center">3</td>
                                    <td><a href="">Hoa Violet</a></td>
                                    <td>Hoa kỷ niệm</td>
                                    <td align="center"><img src="images/tmp/hoa3.jpg" class="hoa" /></td>
                                    <td align="center">
                                        <a href="">Sửa <img src="images/pencil.gif" alt="edit" /></a>
                                        <a href="">Xóa <img src="images/bin.gif" width="16" height="16" alt="delete" /></a>
                                    </td>
                                </tr>
                                <tr>
                                    <td class="align-center">4</td>
                                    <td><a href="">Hoa thủy tiên</a></td>
                                    <td>Hoa tình yêu</td>
                                    <td align="center"><img src="images/tmp/hoa4.jpg" class="hoa" /></td>
                                    <td align="center">
                                        <a href="">Sửa <img src="images/pencil.gif" alt="edit" /></a>
                                        <a href="">Xóa <img src="images/bin.gif" width="16" height="16" alt="delete" /></a>
                                    </td>
                                </tr>
                                <tr>
                                    <td class="align-center">5</td>
                                    <td><a href="">Hoa cẩm chướng</a></td>
                                    <td>Hoa hạnh phúc</td>
                                    <td align="center"><img src="images/tmp/hoa5.jpg" class="hoa" /></td>
                                    <td align="center">
                                        <a href="">Sửa <img src="images/pencil.gif" alt="edit" /></a>
                                        <a href="">Xóa <img src="images/bin.gif" width="16" height="16" alt="delete" /></a>
                                    </td>
                                </tr>
                               
                            </tbody>
                        </table>
                        </form>
                     </div> <!-- End .module-table-body -->
                </div> <!-- End .module -->
                
                
                     <div class="pagination">           
                        <div class="numbers">
                            <span>Page:</span> 
                            <a href="">1</a> 
                            <span>|</span> 
                            <a href="">2</a> 
                            <span>|</span> 
                            <span class="current">3</span> 
                            <span>|</span> 
                            <a href="">4</a> 
                            <span>|</span> 
                            <a href="">5</a> 
                            <span>|</span> 
                            <a href="">6</a> 
                            <span>|</span> 
                            <a href="">7</a> 
                            <span>|</span> 
                            <span>...</span> 
                            <span>|</span> 
                            <a href="">99</a>
                        </div> 
                        <div style="clear: both;"></div> 
                     </div>
                
			</div> <!-- End .grid_12 -->
                
            <div style="clear:both;"></div>
           
        <!-- Footer -->
       <%@include file="/views/BT2/inc/footer.jsp"%>
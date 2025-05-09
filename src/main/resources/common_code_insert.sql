-- OauthProvider
INSERT INTO common_code (code, parent_code, display_name, description, etc1, etc2, etc3, code_order, created_at, updated_at)
VALUES ('OAUTH_PROVIDER', NULL, 'OAuth 제공자', NULL, NULL, NULL, NULL, 1, '2025-05-09 01:32:25', '2025-05-09 01:32:25');

INSERT INTO common_code (code, parent_code, display_name, description, etc1, etc2, etc3, code_order, created_at, updated_at)
VALUES 
('GOOGLE', 'OAUTH_PROVIDER', '구글', NULL, NULL, NULL, NULL, 1, '2025-05-09 01:32:25', '2025-05-09 01:32:25'),
('KAKAO', 'OAUTH_PROVIDER', '카카오', NULL, NULL, NULL, NULL, 2, '2025-05-09 01:32:25', '2025-05-09 01:32:25'),
('NAVER', 'OAUTH_PROVIDER', '네이버', NULL, NULL, NULL, NULL, 3, '2025-05-09 01:32:25', '2025-05-09 01:32:25'),
('NONE', 'OAUTH_PROVIDER', 'none', NULL, NULL, NULL, NULL, 4, '2025-05-09 01:32:25', '2025-05-09 01:32:25');


-- StaffConcept
INSERT INTO common_code (code, parent_code, display_name, description, etc1, etc2, etc3, code_order, created_at, updated_at)
VALUES ('STAFF_CONCEPT', NULL, '스태프 컨셉', NULL, NULL, NULL, NULL, 1, '2025-05-09 01:32:25', '2025-05-09 01:32:25');

INSERT INTO common_code (code, parent_code, display_name, description, etc1, etc2, etc3, code_order, created_at, updated_at)
VALUES
('STAFF_CONCEPT_MAID', 'STAFF_CONCEPT', '메이드', NULL, NULL, NULL, NULL, 1, '2025-05-09 01:32:25', '2025-05-09 01:32:25'),
('STAFF_CONCEPT_BUTLER', 'STAFF_CONCEPT', '집사', NULL, NULL, NULL, NULL, 2, '2025-05-09 01:32:25', '2025-05-09 01:32:25'),
('STAFF_CONCEPT_ANGEL', 'STAFF_CONCEPT', '천사', NULL, NULL, NULL, NULL, 3, '2025-05-09 01:32:25', '2025-05-09 01:32:25'),
('STAFF_CONCEPT_DEMON', 'STAFF_CONCEPT', '악마', NULL, NULL, NULL, NULL, 4, '2025-05-09 01:32:25', '2025-05-09 01:32:25'),
('STAFF_CONCEPT_ANIMAL', 'STAFF_CONCEPT', '동물', NULL, NULL, NULL, NULL, 5, '2025-05-09 01:32:25', '2025-05-09 01:32:25'),
('STAFF_CONCEPT_COOL', 'STAFF_CONCEPT', '쿨', NULL, NULL, NULL, NULL, 6, '2025-05-09 01:32:25', '2025-05-09 01:32:25'),
('STAFF_CONCEPT_SHY', 'STAFF_CONCEPT', '소심', NULL, NULL, NULL, NULL, 7, '2025-05-09 01:32:25', '2025-05-09 01:32:25'),
('STAFF_CONCEPT_PURE', 'STAFF_CONCEPT', '청순', NULL, NULL, NULL, NULL, 8, '2025-05-09 01:32:25', '2025-05-09 01:32:25'),
('STAFF_CONCEPT_GANG', 'STAFF_CONCEPT', '불량/양아치', NULL, NULL, NULL, NULL, 9, '2025-05-09 01:32:25', '2025-05-09 01:32:25'),
('STAFF_CONCEPT_TSUNDERE', 'STAFF_CONCEPT', '츤데레', NULL, NULL, NULL, NULL, 10, '2025-05-09 01:32:25', '2025-05-09 01:32:25'),
('STAFF_CONCEPT_YANDERE', 'STAFF_CONCEPT', '얀데레', NULL, NULL, NULL, NULL, 11, '2025-05-09 01:32:25', '2025-05-09 01:32:25'),
('STAFF_CONCEPT_IDOL', 'STAFF_CONCEPT', '아이돌', NULL, NULL, NULL, NULL, 12, '2025-05-09 01:32:25', '2025-05-09 01:32:25'),
('STAFF_CONCEPT_BIG', 'STAFF_CONCEPT', '빅', NULL, NULL, NULL, NULL, 13, '2025-05-09 01:32:25', '2025-05-09 01:32:25'),
('STAFF_CONCEPT_SMALL', 'STAFF_CONCEPT', '스몰', NULL, NULL, NULL, NULL, 14, '2025-05-09 01:32:25', '2025-05-09 01:32:25'),
('STAFF_CONCEPT_MUSCLE', 'STAFF_CONCEPT', '머슬', NULL, NULL, NULL, NULL, 15, '2025-05-09 01:32:25', '2025-05-09 01:32:25'),
('STAFF_CONCEPT_OTHER', 'STAFF_CONCEPT', '기타', NULL, NULL, NULL, NULL, 16, '2025-05-09 01:32:25', '2025-05-09 01:32:25');


-- StaffType
INSERT INTO common_code (code, parent_code, display_name, description, etc1, etc2, etc3, code_order, created_at, updated_at)
VALUES ('STAFF_TYPE', NULL, '스태프 유형', NULL, NULL, NULL, NULL, 1, '2025-05-09 01:32:25', '2025-05-09 01:32:25');

INSERT INTO common_code (code, parent_code, display_name, description, etc1, etc2, etc3, code_order, created_at, updated_at)
VALUES
('MAID', 'STAFF_TYPE', '메이드', NULL, NULL, NULL, NULL, 1, '2025-05-09 01:32:25', '2025-05-09 01:32:25'),
('BUTLER', 'STAFF_TYPE', '집사', NULL, NULL, NULL, NULL, 2, '2025-05-09 01:32:25', '2025-05-09 01:32:25');


-- ShopConcept
INSERT INTO common_code (code, parent_code, display_name, description, etc1, etc2, etc3, code_order, created_at, updated_at)
VALUES ('SHOP_CONCEPT', NULL, '샵 컨셉', NULL, NULL, NULL, NULL, 1, '2025-05-09 01:32:25', '2025-05-09 01:32:25');

INSERT INTO common_code (code, parent_code, display_name, description, etc1, etc2, etc3, code_order, created_at, updated_at)
VALUES
('SHOP_CONCEPT_MAID', 'SHOP_CONCEPT', '메이드', NULL, NULL, NULL, NULL, 1, '2025-05-09 01:32:25', '2025-05-09 01:32:25'),
('SHOP_CONCEPT_BUTLER', 'SHOP_CONCEPT', '버틀러', NULL, NULL, NULL, NULL, 2, '2025-05-09 01:32:25', '2025-05-09 01:32:25'),
('SHOP_CONCEPT_ANIMAL', 'SHOP_CONCEPT', '동물', NULL, NULL, NULL, NULL, 3, '2025-05-09 01:32:25', '2025-05-09 01:32:25'),
('SHOP_CONCEPT_SCHOOL', 'SHOP_CONCEPT', '교복', NULL, NULL, NULL, NULL, 4, '2025-05-09 01:32:25', '2025-05-09 01:32:25'),
('SHOP_CONCEPT_DEMON', 'SHOP_CONCEPT', '악마', NULL, NULL, NULL, NULL, 5, '2025-05-09 01:32:25', '2025-05-09 01:32:25'),
('SHOP_CONCEPT_ANGEL', 'SHOP_CONCEPT', '천사', NULL, NULL, NULL, NULL, 6, '2025-05-09 01:32:25', '2025-05-09 01:32:25'),
('SHOP_CONCEPT_GANG', 'SHOP_CONCEPT', '불량/양아치', NULL, NULL, NULL, NULL, 7, '2025-05-09 01:32:25', '2025-05-09 01:32:25'),
('SHOP_CONCEPT_TSUNDERE', 'SHOP_CONCEPT', '츤데레', NULL, NULL, NULL, NULL, 8, '2025-05-09 01:32:25', '2025-05-09 01:32:25'),
('SHOP_CONCEPT_YANDERE', 'SHOP_CONCEPT', '얀데레', NULL, NULL, NULL, NULL, 9, '2025-05-09 01:32:25', '2025-05-09 01:32:25'),
('SHOP_CONCEPT_FANTASY', 'SHOP_CONCEPT', '판타지', NULL, NULL, NULL, NULL, 10, '2025-05-09 01:32:25', '2025-05-09 01:32:25'),
('SHOP_CONCEPT_IDOL', 'SHOP_CONCEPT', '아이돌', NULL, NULL, NULL, NULL, 11, '2025-05-09 01:32:25', '2025-05-09 01:32:25'),
('SHOP_CONCEPT_HOSPITAL', 'SHOP_CONCEPT', '병원', NULL, NULL, NULL, NULL, 12, '2025-05-09 01:32:25', '2025-05-09 01:32:25'),
('SHOP_CONCEPT_GOTHIC', 'SHOP_CONCEPT', '고딕', NULL, NULL, NULL, NULL, 13, '2025-05-09 01:32:25', '2025-05-09 01:32:25'),
('SHOP_CONCEPT_BLGL', 'SHOP_CONCEPT', 'BL/GL', NULL, NULL, NULL, NULL, 14, '2025-05-09 01:32:25', '2025-05-09 01:32:25'),
('SHOP_CONCEPT_BIG', 'SHOP_CONCEPT', '빅', NULL, NULL, NULL, NULL, 15, '2025-05-09 01:32:25', '2025-05-09 01:32:25'),
('SHOP_CONCEPT_SMALL', 'SHOP_CONCEPT', '스몰', NULL, NULL, NULL, NULL, 16, '2025-05-09 01:32:25', '2025-05-09 01:32:25'),
('SHOP_CONCEPT_MUSCLE', 'SHOP_CONCEPT', '머슬', NULL, NULL, NULL, NULL, 17, '2025-05-09 01:32:25', '2025-05-09 01:32:25'),
('SHOP_CONCEPT_OTHER', 'SHOP_CONCEPT', '기타', NULL, NULL, NULL, NULL, 18, '2025-05-09 01:32:25', '2025-05-09 01:32:25');


-- SnsLinkType
INSERT INTO common_code (code, parent_code, display_name, description, etc1, etc2, etc3, code_order, created_at, updated_at)
VALUES ('SNS_LINK_TYPE', NULL, 'SNS 링크 구분', NULL, NULL, NULL, NULL, 1, '2025-05-09 01:32:25', '2025-05-09 01:32:25');

INSERT INTO common_code (code, parent_code, display_name, description, etc1, etc2, etc3, code_order, created_at, updated_at)
VALUES
('SHOP_LINK', 'SNS_LINK_TYPE', '업체 링크', NULL, NULL, NULL, NULL, 1, '2025-05-09 01:32:25', '2025-05-09 01:32:25'),
('STAFF_LINK', 'SNS_LINK_TYPE', '메이드/집사 링크', NULL, NULL, NULL, NULL, 2, '2025-05-09 01:32:25', '2025-05-09 01:32:25');


-- SnsType
INSERT INTO common_code (code, parent_code, display_name, description, etc1, etc2, etc3, code_order, created_at, updated_at)
VALUES ('SNS_TYPE', NULL, 'SNS 종류', NULL, NULL, NULL, NULL, 1, '2025-05-09 01:32:25', '2025-05-09 01:32:25');

INSERT INTO common_code (code, parent_code, display_name, description, etc1, etc2, etc3, code_order, created_at, updated_at)
VALUES
('INSTAGRAM', 'SNS_TYPE', '인스타그램', NULL, NULL, NULL, NULL, 1, '2025-05-09 01:32:25', '2025-05-09 01:32:25'),
('X', 'SNS_TYPE', '엑스(트위터)', NULL, NULL, NULL, NULL, 2, '2025-05-09 01:32:25', '2025-05-09 01:32:25'),
('NAVER', 'SNS_TYPE', '네이버', NULL, NULL, NULL, NULL, 3, '2025-05-09 01:32:25', '2025-05-09 01:32:25'),
('YOUTUBE', 'SNS_TYPE', '유튜브', NULL, NULL, NULL, NULL, 4, '2025-05-09 01:32:25', '2025-05-09 01:32:25'),
('TIKTOK', 'SNS_TYPE', '틱톡', NULL, NULL, NULL, NULL, 5, '2025-05-09 01:32:25', '2025-05-09 01:32:25');
